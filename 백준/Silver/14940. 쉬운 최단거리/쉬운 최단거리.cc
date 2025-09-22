#include <iostream>
#include <queue>
using namespace std;

int n, m;
int dy[] = { 1, -1, 0, 0 };	// y축 변화
int dx[] = { 0, 0, -1, 1 };		// x축 변화
int board[1001][1001];	// 지도의 최대 크기
bool check[1001][1001] = { false };

void bfs(int y, int x) {
	queue <pair<int, int>> q;
	q.push({ y, x });
	board[y][x] = 0;
	check[y][x] = true;
	
	while (!q.empty()) {
		int cur_y = q.front().first;
		int cur_x = q.front().second;
		q.pop();
		
		for (int i = 0; i < 4; i++) {
			int ny = cur_y + dy[i];
			int nx = cur_x + dx[i];
			if (ny >= 0 && ny <= n && nx >= 0 && ny <= m ) {
				if (!check[ny][nx] && board[ny][nx] != 0) {
					q.push({ ny, nx });
					check[ny][nx] = true;
					board[ny][nx] = board[cur_y][cur_x] + 1;
				}
			}
		}
	}

	return;
}

int main() {
	int y = -1, x = 1;
	cin >> n >> m;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			int a;
			cin >> board[i][j];
			if (board[i][j] == 2) {
				y = i;
				x = j;
			}
		}
	}
	bfs(y, x);
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			if (!check[i][j] && board[i][j] > 0) {
				cout << -1 << ' ';
			}
			else {
				cout << board[i][j] << ' ';
			}
		}
		cout << '\n';
	}
}