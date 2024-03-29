#include <stdio.h>

int main() {
    int n;
    printf("Enter a positive integer: ");
    scanf("%d", &n);

    printf("The 3n + 1 sequence starting at %d is:\n", n);

    while (n != 1) {
        printf("%d ", n);
        if (n % 2 == 0) {
            n = n / 2;
        } else {
            n = 3 * n + 1;
        }
    }
    printf("%d\n", n);
    
    return 0;
}
