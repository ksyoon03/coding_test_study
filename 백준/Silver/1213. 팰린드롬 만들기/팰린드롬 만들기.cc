#include <iostream>
#include<algorithm>
using namespace std;

int main() {
	string str;
	int alpha[26] = { 0 };	// 각 알파벳 개수
	int oddCnt = 0;	// 홀수 개수
	char oddChar;	// 홀수 개수인 문자
	cin >> str;

	for (char s : str) {
		alpha[s - 'A']++;	// 각 알파벳이 몇개씩인지
	}

	for (int i = 0; i < 26; i++) {
		if (alpha[i] % 2 != 0) {
			oddCnt++;
			oddChar = i + 'A';
		}
	}

	// 홀수 알파벳 개수가 2개 이상이면 팰린드롬 불가능
	if (oddCnt >= 2) {
		cout << "I'm Sorry Hansoo" << endl;
		return 0;
	}

	string front;	// 문자열 앞쪽 절반
	string behind;	// 문자열 뒷쪽 절반
	for (int i = 0; i < 26; i++) {
		for (int j = 0; j < alpha[i] / 2; j++) {	// 2개 이상인 알파벳만 추가
			front += i + 'A';
			behind += i + 'A';
		}
	}
	reverse(behind.begin(), behind.end());	// 뒷쪽 절반 뒤집기(내림차순 정렬)

	if (oddCnt % 2 == 0) {	// 홀수 갯수의 알파벳이 없을 때
		cout << front << behind << endl;
	}
	else {	// 홀수 갯수의 알파벳이 있을 때
		cout << front << oddChar << behind << endl;
	}
}