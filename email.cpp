#include <iostream>
#include <fstream>
#include <iomanip>

using namespace std;

class EmailGenerator {
public:
    EmailGenerator() {}

    void generateEmailFile() {
        while (true) {
            cout << "Note: Enter lowercase alphabets only\n\nEnter the department(cs/se/it/ds)\n";
            string dep;
            cin >> dep;
            cout << "Enter the batch (without f)\n";
            string bat;
            cin >> bat;
            cout << "Enter the section (m/a)\n";
            string sec;
            cin >> sec;

            string fileName = dep + "f" + bat + sec + ".txt";
            ofstream fout(fileName.c_str());

            generateEmails(fout, dep, bat, sec);

            fout.close();

            cout << "File created successfully.\n";
        }
    }

private:
    void generateEmails(ofstream& fout, const string& dep, const string& bat, const string& sec) {
        for (int i = 1; i < 61; i++) {
            if (dep == "ds") {
                fout << "bsdsf" << bat << sec << 0 << setfill('0') << setw(2) << i << "@pucit.edu.pk";
            } else {
                fout << "b" << dep << "f" << bat << sec << 5 << setfill('0') << setw(2) << i << "@pucit.edu.pk";
            }

            if (i != 60) {
                fout << ",";
            }
        }
    }
};

int main() {
    EmailGenerator emailGenerator;
    emailGenerator.generateEmailFile();

    return 0;
}
