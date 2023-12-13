import math
import struct

class CalcException(Exception):
    def __init__(self, cause):
        super().__init__(cause)

class Equations:
    def calculate(self, x):
        rad = x * math.pi / 180.0
        try:
            numerator = math.tan(rad)
            denominator = math.sin(4 * rad) - 2 * math.cos(rad)

            # Check for division by zero
            if denominator == 0:
                raise ArithmeticError()

            y = numerator / denominator

            # Check if the result is NaN or Infinite, or if x is a special case
            if math.isnan(y) or math.isinf(y) or x == 90 or x == -90:
                raise ArithmeticError()

        except ArithmeticError:
            # Create a higher-level exception with an explanation of the error cause
            if rad == math.pi / 2.0 or rad == -math.pi / 2.0:
                raise CalcException("Exception reason: Illegal value of X for tangent calculation")
            else:
                raise CalcException("Unknown reason for the exception during equation calculation")

        return y

class FileInOut:
    def __init__(self, file_name="Lab8"):
        self.file_name = file_name

    def write_res_txt(self, result):
        with open(self.file_name + ".txt", "w") as file:
            file.write(str(result))

    def read_res_txt(self):
        file_path = self.file_name + ".txt"
        try:
            with open(file_path, "r") as file:
                result = file.read()
        except FileNotFoundError as ex:
            result = str(ex)
        return result

    def write_res_bin(self, result):
        with open(self.file_name + ".bin", "wb") as file:
            file.write(struct.pack('!d', result))

    def read_res_bin(self):
        file_path = self.file_name + ".bin"
        try:
            with open(file_path, "rb") as file:
                result_bytes = file.read(8)
                result = struct.unpack('!d', result_bytes)[0]
        except (FileNotFoundError, OSError) as ex:
            result = str(ex)
        return result

def main():
    try:
        # Initialize Equations object for mathematical calculations
        eq = Equations()

        # Prompt user for input
        x = float(input("Enter X: "))

        # Calculate Y and display the result
        result = eq.calculate(x)
        print("Y:", result)

        # Initialize FileInOut object for file input/output operations
        fio = FileInOut()

        # Write the result to .txt and .bin files
        fio.write_res_txt(result)
        fio.write_res_bin(result)

        # Display the result read from .txt and .bin files
        print("Output of the result from the file .txt:", fio.read_res_txt())
        print("Output of the result from the file .bin:", fio.read_res_bin())

    except CalcException as ex:
        
        print(ex)

if __name__ == "__main__":
    main()
