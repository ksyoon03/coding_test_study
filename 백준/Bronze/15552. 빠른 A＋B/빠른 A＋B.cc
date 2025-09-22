#include <stdio.h>

int main(void)
{
	int t = 0, i, a = 0, b = 0;

	scanf("%d", &t);

	for (i = 0; i < t; i++) {
		scanf("%d %d", &a, &b);
		printf("%d\n", a + b);
	}

	return 0;
}