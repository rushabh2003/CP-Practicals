#include <bits/stdc++.h> 
using namespace std; 

int isPrime(int x)  { 
	int s = sqrt(x); 

	for (int i = 2; i <= s; i++) {
		if (x % i == 0) 
			return 0; 
	}
	return 1; 
} 

void Num(int x, int &a, int &b) { 
	for (int i = 2; i <= x / 2; i++) { 
		if (isPrime(i) && isPrime(x - i)) { 
			a = i; 
			b = x - i; 
			return; 
		} 
	} 
} 

void generate(int n) { 
	if (n <= 7) 
		cout << "Impossible to form" << endl; 

	int a, b; 

	if (n % 2 != 0) { 
		Num(n - 5, a, b); 
		cout << "2 3 " << a << " " << b << endl; 
	} 

	else { 

		Num(n - 4, a, b); 

		cout << "2 2 " << a << " " << b << endl; 
	} 
} 

int main() { 
	int n;
	cout << "Enter n: ";
	cin >> n;
	generate(n); 
	return 0; 
} 
