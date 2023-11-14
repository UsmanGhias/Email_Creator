while True:
    print("Note: Enter lowercase alphabets only\n\nEnter the department(cs/se/it/ds)")
    dep = input()
    print("Enter the batch (without f)")
    bat = input()
    print("Enter the section (m/a)")
    sec = input()

    fileName = f"{dep}f{bat}{sec}.txt"
    
    with open(fileName, 'w') as fout:
        for i in range(1, 61):
            if dep == "ds":
                fout.write(f"bsdsf{bat}{sec}0{i:02d}@pucit.edu.pk")
            else:
                fout.write(f"b{dep}f{bat}{sec}5{i:02d}@pucit.edu.pk")

            if i != 60:
                fout.write(',')

    print("File created successfully.")
