#include <iostream>
#include <vector>
using namespace std;

int m, n, k;
int field[51][51];
int dx[] = { 0, 0, -1, 1 };
int dy[] = { 1, -1, 0, 0 };

void dfs(int x, int y) {
	field[x][y] = 0;
	
	for (int i = 0; i < 4; i++) {
		int nx = x + dx[i];
		int ny = y + dy[i];
		if (nx >= 0 && nx < m && ny >= 0 && ny < n && field[nx][ny] == 1) {
				dfs(nx, ny);
		}
	}
}

int main() {
	int t;
	cin >> t;

	while (t-- > 0) {
		cin >> m >> n >> k;
		for (int i = 0; i < k; i++) {
			int x, y;
			cin >> x >> y;
			field[x][y] = 1;
		}

		int cnt = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (field[i][j] == 1) {
					cnt++;
					dfs(i, j);
				}
			}
		}
		cout << cnt << endl;
	}
}