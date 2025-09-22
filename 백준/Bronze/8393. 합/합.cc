#include <stdio.h>

int main(void)
{
	int n = 0, i, tot = 0;

	scanf("%d", &n);
	for (i = 1; i <= n; i++) {
		tot += i;
	}
	printf("%d\n", tot);

	return 0;
}