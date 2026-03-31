#include <iostream>
#include <vector>
#include <set>
using namespace std;

int main() {
	int n; // 학생 수
	cin >> n;

	vector<string> student(n);
	for (int i = 0; i < n; i++) {
		cin >> student[i];
	}

	int cnt = 0;
	int idx = 1;
	set<string> check;
	for (int i = 0; i < 100; i++) {
		for (int j = 0; j < student.size(); j++) {
			string tmp = student[j].substr(student[0].length() - idx, idx);
			check.insert(tmp);
		}
		idx++;
		cnt++;
		if (check.size() == n) {
			cout << cnt << endl;
			break;
		}
		check.clear();
	}
}