#include <stdio.h>

int main(void)
{
	double a, b;

	scanf("%lf %lf", &a, &b);

	if (a > b) {
		printf(">", a, b);
	}
	else if (a < b) {
		printf("<", a, b);
	}
	else {
		printf("==", a, b);
	}

	return 0;
}