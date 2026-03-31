#include <iostream>
using namespace std;

int main() {
	int t;
	cin >> t;
	
	while (t--) {
		int w;	// 쓰레기차 용량,
		int n;		// 지점의 개수
		cin >> w >> n;

		int totalDistance = 0;	// 이동한 총 거리
		int currentTrash = 0;		// 현재 쓰레기차의 용량
		int currentLocation = 0;	// 현재 쓰레기차의 위치 (초기값: 쓰레기장)

		int x_i; // 쓰레기장과 지점 사이의 거리
		int w_i;	// i 지점의 쓰레기 양

		for (int i = 0; i < n; i++) {
			
			cin >> x_i >> w_i;

			totalDistance += (x_i - currentLocation);	// 총 이동 거리 += (지점 간 이동 거리 - 현재 위치)
			currentLocation = x_i;	// 현재 위치 = 쓰레기장과 지점의 거리

			if (currentTrash + w_i > w) {		// i지점의 쓰레기 적재 시 쓰레기차의 최대 용량을 초과한다면
				// 쓰레기장 이동 -> 쓰레기차 비움 -> i지점으로 다시 이동
				totalDistance += x_i;	
				currentTrash = 0;
				totalDistance += x_i;	
			}
			currentTrash += w_i; // i지점 쓰레기 적재

			if (currentTrash == w) {		// i지점 쓰레기 적재 후 쓰레기차 용량이 꽉 찼을 경우
				// 쓰레기장 이동 -> 쓰레기차 비움
				totalDistance += x_i;
				currentTrash = 0;
				currentLocation = 0; // 현재 위치 쓰레기장
			}
		}
		if (currentLocation != 0) {	// 모든 지점 방문 후 위치가 쓰레기장이 아닐 경우
			totalDistance += x_i;		// 쓰레기장으로 복귀
		}
		cout << totalDistance << endl;
	}
}