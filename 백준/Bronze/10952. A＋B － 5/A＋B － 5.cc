#include <stdio.h>

int main(void)
{
	int i, a = 0, b = 0;

	while (1)
	{
		scanf("%d %d", &a, &b);
		if (a != 0 || b != 0) {
			printf("%d\n", a + b);
		}
		else {
			return 0;
		}
	}
}