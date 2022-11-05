//private operations
#include<iostream>
using namespace std;
class A
{
    private :
        int a, b;
        void show()
        {
            cout<<"Private function";
        }
    public :
        void show();
        {
            cout<<"a is "<<a;
            cout<<"b is "<<b;
        }    
    A(int x, int y)//parameterised constructor called
    {
        a=x;
        b=y;
    }
};
int main()
{
    A.obj(10, 20);
    obj.show();
    return 0;
}
