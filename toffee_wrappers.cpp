#include <bits/stdc++.h>
using namespace std;

int main() {
  int n = 70;
  int ans = 0;
  int k = 5;
  while (n > 0) {
    ans += n;
    n /= k;
  }
  cout << ans << endl;
  return 0;
}
