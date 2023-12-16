#include <stdio.h>

int main()
{
  int n, m, i, j, t, r; char s[52]; static long long h[26];
  scanf("%d%d",&n,&m);
  for(i=0;i<n;i++)
  {
    t=(i+1)*(2*n-i)+(i+n+1)*(n-i);
    scanf("%s",s);
    for(j=0;j<m;j++)
    {
      r=(j+1)*(2*m-j)+(j+m+1)*(m-j);
      h[s[j]-'A']+=t*r;
    }
  }
  for(i=0;i<26;i++) printf("%lld\n", h[i]);
}