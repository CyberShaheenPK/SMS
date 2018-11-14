#include<iostream>
using namespace std;
int main()
{
	int avg,sum=0,i;
	int arr[10];
	for(i=0;i<10;i++)
	{
		cout<<"Enter Marks"<<endl;
		cin>>arr[i];
	}
	for(i=0;i<10;i++)
	{
		sum=sum+arr[i];
		avg=sum/10;
	}
	cout<<"Average marks"<<avg<<endl;
	return 0;
}
