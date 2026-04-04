#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

// 독립된 간선의 개수를 구하는 문제

vector <int> node[1001];	// 정점
bool check[1001];	// 방문 체크

void dfs(int x) {
	check[x] = true;		// 정점 방문 표시

	for (int i = 0; i < node[x].size(); i++) {	// 연결된 정점 수만큼 반복
		int y = node[x][i];	// 연결된 정점
		if (!check[y]) {	// 해당 정점에 방문하지 않았다면
			check[y] = true;	// 방문 표시
			dfs(y);	// 연결된 정점에서 dfs 실행 (재귀)
		}
	}
}

int main() {
	int n;		// 정점 개수
	int m;	// 간선 개수
	cin >> n >> m;
	
	for (int i = 1; i <= m; i++) {
		int u, v;		// 양 끝점
		cin >> u >> v;
		// 양방향 연결
		node[u].push_back(v);
		node[v].push_back(u);
	}
	
	for (int i = 1; i <= n; i++) {
		sort(node[i].begin(), node[i].end());	// 노드 오름차순 정렬
	}

	int cnt = 0; // 연결 요소 개수
	for (int i = 1; i <= n; i++) {		// 정점의 수만큼 반복
		if (!check[i]) {		// 정점에 방문하지 않았다면
			cnt++;	// 연결 요소 개수 + 1
			dfs(i);	// dfs 실행
		}
	}

	cout << cnt << "\n";
}