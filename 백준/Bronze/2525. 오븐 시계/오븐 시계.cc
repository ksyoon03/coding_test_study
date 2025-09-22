#include <stdio.h>

int main(void)
{
	int hour, min, cook, time;

	scanf("%d %d", &hour, &min);
	scanf("%d", &cook);

	min = min + cook;
	if (min >= 60) {
		time = min / 60;
		min = min % 60;
		hour = hour + time;
		if (hour >= 24) {
			hour = hour % 24;
		}
	}
	printf("%d %d", hour, min);
	
	return 0;
}