#include <iostream>
#include <vector>
using namespace std;

int board[129][129];
int white = 0;
int blue = 0;

bool check(int x, int y, int size) {
	for (int i = x; i < x + size; i++) {
		for (int j = y; j < y + size; j++) {
			if (board[i][j] != board[x][y]) {
				return false;
			}
		}
	}
	return true;
}

void paper(int x, int y, int size) {
	if (check(x, y, size)) {
		if (board[x][y] == 0) white++;
		else blue++;
		return;
	}
	size /= 2;
	paper(x, y, size);
	paper(x + size, y, size);
	paper(x, y + size, size);
	paper(x + size, y + size, size);
}

int main() {
	int n;
	cin >> n;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			cin >> board[i][j];
		}
	}
	paper(0, 0, n);
	cout << white << endl;
	cout << blue << endl;
}