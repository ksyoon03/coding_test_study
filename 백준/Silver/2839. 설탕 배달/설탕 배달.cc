#include <iostream>
using namespace std;

int main() {
	int n;
	cin >> n;
	
	int cnt = 0;
	while (n > 0) {
		// n을 0으로 만드는게 불가능 할 때
		if (n == 1 || n < 3) {
			cnt = -1;
			break;
		}

		// n이 5 이상
		if (n >= 5) {
			// 5를 빼는 경우
			// 1. n이 5의 배수일 때
			if (n % 5 == 0) {
				n -= 5;
				cnt++;
			}
			// 2. n이 5와 3의 배수일 때
			else if (n % 5 == 0 && n % 3 == 0) {
				n -= 5;
				cnt++;
			}
			// 3. n이 5와 3의 배수가 아닐 때
			else if (n % 5 != 0 && n % 3 != 0) {
				n -= 5;
				cnt++;
			}
			// 3을 빼는 경우
			// n이 5의 배수가 아니고, 3의 배수일 때
			else {
				n -= 3;
				cnt++;
			}
		}
		// n이 5 미만이면 3을 뺌
		else {
			n -= 3;
			cnt++;
		}
	}
	cout <<  cnt << "\n";
}