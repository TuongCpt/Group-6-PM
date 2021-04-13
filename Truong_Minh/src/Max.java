
public class Max {
 public int Max2(int a, int b) {
  if (a >= b)
   return a;
  else
   return b;
 }
 public int Max3(int a, int b, int c) {
  if (a >= b)
   if (a >= c)
    return a;
   else
    return c;
  else if (b >= c)
   return b;
  else
   return c;
 }
}

