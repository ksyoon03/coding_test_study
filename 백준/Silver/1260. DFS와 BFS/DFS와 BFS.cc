#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>
using namespace std;

vector <int> node[1001];
bool check[1001];

void dfs(int x) {
	check[x] = true;
	cout << x << " ";

	for (int i = 0; i < node[x].size(); i++) {
		int y = node[x][i];
		if (!check[y]) {
			dfs(y);
		}
	}
}

void bfs(int x) {
	queue <int> q;
	q.push(x);
	check[x] = true;

	while (!q.empty()) {
		int y = q.front();
		q.pop();
		cout << y << " ";

		for (int i = 0; i < node[y].size(); i++) {
			int z = node[y][i];
			if (!check[z]) {
				check[z] = true;
				q.push(z);
			}
		}
	}
}

int main() {
	int n, m, v;
	cin >> n >> m >> v;

	for (int i = 0; i < m; i++) {
		int a, b;
		cin >> a >> b;
		node[a].push_back(b);
		node[b].push_back(a);
	}
	
	for (int i = 1; i <= n; i++) {
		sort(node[i].begin(), node[i].end());
	}

	dfs(v);
	cout << endl;
	for (int i = 1; i <= n; i++) {
		check[i] = false;
	}
	bfs(v);
}