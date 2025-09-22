#include <stdio.h>

int main(void)
{
	int t = 0, a = 0, b = 0, i;

	scanf("%d", &t);
	for (i = 1; i <= t; i++) {
		scanf("%d %d", &a, &b);
		printf("Case #%d: %d + %d = %d\n", i, a, b, a + b);
	}

	return 0;
}