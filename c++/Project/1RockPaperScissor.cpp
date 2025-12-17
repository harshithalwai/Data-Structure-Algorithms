#include <bits/stdc++.h>
using namespace std;
void intro()
{
    cout << "\t\t\t--------------------------------------------------------------------------------\n";
    cout << "\t\t\t\t\t            Rock Paper Scissor                                 \n ";
    cout << "\t\t\t--------------------------------------------------------------------------------\n";
}
int main()
{
    system("cls");
    intro();
    cout << endl
         << endl;
    int Turn = 1;
    srand(time(NULL));
    int Player = 0, comp = 0;
    // 1. Rock
    // 2. Paper
    // 3. Scissor
    do
    {
        int CompTurn = rand() % 3 + 1;
        int choice;
        cout << "\t\t\t--------------------------------------------------------------------------------\n";
        cout << "\t\t\t\t\t            RULES                                                     \n ";
        cout << " \t\t\tPlease choose one of the following :-\n  \t\t\t\t\t\t\t\t 1. Rock \n \t\t\t\t\t\t\t\t 2. Paper\n\t\t\t\t\t\t\t\t 3. Scissor \n ";
        cout << "\t\t\t--------------------------------------------------------------------------------\n";
        cout<<"\n\t Your Choice : ";
        cin >> choice;
        switch (choice)
        {
        case 1:
            if (choice == CompTurn)
            {
                cout << "\n\t\t\t\t\tIt's a Draw !\n";
                continue;
            }
            else if (CompTurn == 2)
            {
                cout << "\n\t\t\t\t\tYou Lost the Point !\n";
                comp++;
            }
            else
            {
                cout << "\n\t\t\t\t\tYou Won the Point !\n";
                Player++;
            }
            break;
        case 2:
            if (choice == CompTurn)
            {
                cout << "\n\t\t\t\t\tIt's a Draw !\n";
                continue;
            }
            else if (CompTurn == 3)
            {
                cout << "\n\t\t\t\t\tYou Lost the Point !\n";
                comp++;
            }
            else
            {
                cout << "\n\t\t\t\t\tYou Won the Point !\n";
                Player++;
            }
            break;

        case 3:
            if (choice == CompTurn)
            {
                cout << "\n\t\t\t\t\tIt's a Draw !\n";
                continue;
            }
            else if (CompTurn == 1)
            {
                cout << "\n\t\t\t\t\tYou Lost the Point !\n";
                comp++;
            }
            else
            {
                cout << "\n\t\t\t\t\tYou Won the Point !\n";
                Player++;
            }
            break;
        }

        Turn++;
    } while (Turn <= 10);
    if (Player == comp)
    {
        cout << "\n\t\t\t It's a Draw !\n";
    }
    else if (Player > comp)
    {
        cout << "\n \t\t\t\t\t\t You Won The Game !\n";
    }
    else
    {
        cout << "\n \t\t\t\t\t\t Sorry  !!   You Lost The Game !\n";
    }

    return 0;
}