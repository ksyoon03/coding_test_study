#include <iostream>
using namespace std;

// 두 사람의 r을 반지름으로 하는
// 두 개의 원의 교점 개수를 구하는 문제

int main() {
	int t;
	cin >> t;
	while (t-- > 0) {
		int x1, y1;	// 조규현 좌표
		int r1;	// 조규현 계산
		int x2, y2; // 백승현 좌표
		int r2;	// 백승현 계산
		cin >> x1 >> y1 >> r1 >> x2 >> y2 >> r2;

		int cnt = 0;	// 가능한 위치의 수
		int d = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);	// 두 사람의 좌표 사이의 거리 제곱

		// 두 원의 교점이 0개
		// 1. 원이 서로 떨어져 있는 경우 (외부)
		// 2. 한 원이 다른 원의 내부에 있는 경우
		if (d > (r1 + r2) * (r1 + r2) || d < (r1 - r2) * (r1 - r2)) {
			cnt = 0;
		}
		// 두 원의 교점이 1개
		// 1. 외접	2. 내접
		else if (d == (r1 + r2) * (r1 + r2) || d == (r1 - r2) * (r1 - r2)) {
			if (d == 0 && r1 == r2) {
				cnt = -1;
			}
			else {
				cnt = 1;
			}
			
		}
		// 두 원의 교점이 2개
		// 두 점에서 만나는 경우
		else if (d > (r1 - r2) * (r1 - r2) && d < (r1 + r2) * (r1 + r2)) {
			cnt = 2;
		}
		//	교점이 무수히 많음
		// 두 원이 일치하는 경우
		//else if (d == 0 && r1 == r2) {
		//	cnt = -1;
		//}

		cout << cnt << endl;
	}
}