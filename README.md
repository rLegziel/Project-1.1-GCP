# Project-1.1

NEXT MEETING : Meeting 2- 07/10 16:30-20:30 A0.736 Universiteitssingel 40

## Meeting 1: 05/10 13:15- 14:45 Attendees: everyone
### Goals by next meeting
- read more literature about the subjects at hand-graph colouring, chromatic numbers, depth/breadth search algorithms 
- create pseudo-code sketches of any idea you have, normal code also works. no need to do extensive debugging just so we understand the concept and logic behind it.

## Meeting 2: 07/10 16:30-20:30 A0.736 Universiteitssingel 40
### Meeting goals :
- Assign all positions formally(think of which one would you want and are a good fit).

- Decide which path we take and start working on a unified model.



## Additional reading:
https://algorithms.tutorialhorizon.com/graph-implementation-adjacency-list-better-set-2/
https://www.callicoder.com/java-hashmap/

/////////////////////////////////////////////////////////////////////////////////////////////////////


Colorarea hartii folosind metoda Greedy.
Fiind data o harta cu n tari, se cere o solutie de colorare a hartii, utilizand cel mult patru culori, astfel incat doua tari ce au frontiera comuna sa fie colorate diferit. Este demonstrat faptul ca sunt suficiente numai patru culori pentru ca orice harta sa poata fi colorata.
Exemplu:
colorare.in
6
alb verde galben rosu
1 2
1 3
1 4
1 5
1 6
2 3
2 5
2 6
3 4
3 5
4 5
5 6
colorare.out
1 alb
2 verde
3 galben
4 verde
5 rosu
6 galben


#include <fstream>
using namespace std;
ifstream fin("colorare.in");
ofstream fout("colorare.out");

int A[101][101];// A[i][j]==1 pt tari vecine, 0 altfel
int X[101],n;//X[i]=indicele culorii tarii i
char C[5][21];//culorile

void afisare()
{
    for(int i=1;i<=n;i++)
        fout<<i<<" "<<C[X[i]]<<"\n";//afisez tara si culoarea
    fout<<endl;
}

int valid(int k)
{//1 daca tara k poate fi colorata cu X[k], 0 altfel
    for(int i=1;i<k;i++)//pt tarile colorate deja
        if(A[i][k]==1 && X[i]==X[k]) return 0;//exita tara invecinata care are aceeasi culoare=>0
    return 1;
}

int alege(int k)
{//alege culoarea minima valida
    for(int i=1;i<=4;i++)//am 4 culori
        {
            X[k]=i;//plasez culoarea
            if(valid(k)) return i;//daca e buna o returnez
        }
    return 0;//daca nu putem colora
}

void colorare()
{//plaseaza in X[i] culoarea tarii i
    for(int i=1;i<=n;i++)
        X[i]=alege(i);//culoarea minima
}

int main()
{
    int t1,t2;
    fin>>n;//citesc nr de tari
    for(int i=1;i<=4;i++)
        fin>>C[i];//citesc culorile
    while(fin>>t1>>t2)//pereche de tari vecine
    {
        A[t1][t2]=1;//pun 1 in matrice
        A[t2][t1]=1;
    }
    colorare();
    afisare();
    return 0;
}
