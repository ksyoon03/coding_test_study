#include <stdio.h>

int main(void)
{
	int H, M, num;

	scanf("%d %d", &H, &M);

	if (H > 0 && H < 24) {
		if (M >= 0 && M < 45) {
			num = M - 45;
			printf("%d %d", H - 1, 60 + num);
		}
		else if (M >= 45 && M < 60) {
			printf("%d %d", H, M - 45);
		}
	}
	else if (H == 0) {
		if (M >= 0 && M < 45) {
			num = M - 45;
			printf("%d %d", 23, 60 + num);
		}
		else if (M >= 45 && M < 60) {
			printf("%d %d", H, M - 45);
		}
	}

	return 0;
}