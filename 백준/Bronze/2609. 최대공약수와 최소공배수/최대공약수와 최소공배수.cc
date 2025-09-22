#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int gcd(int a, int b) {
	if (a >= b) {
		while (b) {
			int r = b;
			b = a % b;
			a = r;
		}
		return a;
	}
	if (a < b) {
		while (a) {
			int r = a;
			a = b % a;
			b = r;
		}
		return b;
	}
}

int lcm(int a, int b) {
	return (a * b) / gcd(a, b);
}

int main() {
	int a, b;
	cin >> a >> b;
	cout << gcd(a, b) << endl << lcm(a, b);
}