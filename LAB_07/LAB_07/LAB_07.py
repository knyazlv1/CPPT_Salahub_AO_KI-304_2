# This program allows the user to create a square matrix with customizable fillers
# and saves the matrix to a text file.

def main():
    n_rows = 0

    data_file = open("MyFile.txt", "w")

    # Get the size of the square matrix
    while n_rows < 5:
        if n_rows < 5:
            print("Enter a number greater than or equal to 5: ")
        n_rows = int(input("Enter the size of the square matrix: "))

    # Create a jagged array of characters
    arr = [[' ' for _ in range(n_rows)] for _ in range(n_rows)]

    filler = input("\nEnter symbol filler: ")

    # Fill the matrix with symbols
    for i in range(n_rows): 
        for j in range(n_rows):
            if len(filler) == 1:
                if i == 0 or i == n_rows - 1 or j == 0 or j == n_rows - 1:
                    arr[i][j] = filler
                    print(arr[i][j], end=" ")
                    data_file.write(arr[i][j] + " ")
                elif i == 1 or i == n_rows - 2 or j == 1 or j == n_rows - 2:
                    arr[i][j] = ' '
                    print(arr[i][j], end=" ")
                    data_file.write(arr[i][j] + " ")
                else:
                    arr[i][j] = filler
                    print(arr[i][j], end=" ")
                    data_file.write(arr[i][j] + " ")
            elif len(filler) == 0:
                print("\nNot entered symbol filler")
                break
            else:
                print("\nToo many symbols for filler")
                break
        print("\n")
        data_file.write("\n")
        data_file.write("\n")

    data_file.close()

if __name__ == "__main__":
    main()
