#include <iostream>
#include <queue>
using namespace std;

int n, k;
int check[100001];

int bfs() {
	queue <int> q;
	q.push(n);
	check[n] = 0;

	while (!q.empty()) {
		int cur = q.front();
		q.pop();

		if (cur == k) break;

		int back = cur - 1;
		int forward = cur + 1;
		int warp = cur * 2;

		if (back >= 0 && check[back] == 0) {
			q.push(back);
			check[back] = check[cur] + 1;
		}

		if (forward < 100001 && check[forward] == 0) {
			q.push(forward);
			check[forward] = check[cur] + 1;
		}

		if (warp < 100001 && check[warp] == 0) {
			q.push(warp);
			check[warp] = check[cur] + 1;
		}
	}

	return check[k];
}

int main() {
	cin >> n >> k;
	cout << bfs() << endl;
}