#include <stdio.h>

int main(void)
{
	int n, num, newnum=-1, start, count = 0;

	scanf("%d", &n);

	start = n;

	while (start != newnum)
	{
			num = n / 10 + n % 10;

			newnum = n % 10 * 10 + num % 10;

			n = newnum;

			count++;
	}

	printf("%d\n", count);

	return 0;
}