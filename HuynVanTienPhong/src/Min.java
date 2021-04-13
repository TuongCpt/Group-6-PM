public class Min {
 public int min2(int a, int b) {
  if (a <= b)
   return a;
  else
   return b;
 }
 public int min3(int a, int b, int c) {
  if (a <= b)
   if (a <= c)
    return a;
   else
    return c;
  else if (b <= c)
   return b;
  else
   return c;
 }
}