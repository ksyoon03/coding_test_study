#include <stdio.h>

int main(void) {
	int i, j, max = 0, row;
	int num[9] = { 0 };

	for (i = 0; i < 9; i++) {
		scanf("%d", &num[i]);
	}

	max = num[i];
	for (j = 0; j < i; j++) {
		if (max < num[j]) {
			max = num[j];
			row = j + 1;
		}
	}

	printf("%d\n%d\n", max,row);

	return 0;
}