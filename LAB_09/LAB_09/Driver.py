# Driver.py

# Importing the CopyMachine class
from CopyMachine import CopyMachine

# Main function to test the functionality of the CopyMachine class
def main():
    try:
        # Creating an instance of the CopyMachine class
        cm = CopyMachine()

        # Testing the change_cartridge method
        cm.change_cartridge()

        # Turning on the power of the CopyMachine
        cm.turn_on_power()

        # Retrieving and logging information about the scanner's dimensions
        cm.get_info_scaner_dimensions()

        # Attempting to change the cartridge while the CopyMachine is powered on
        cm.change_cartridge()

        # Scanning and saving photo data
        cm.scan_photo_and_save_data("cat")

        # Attempting to scan the same photo again
        cm.scan_photo_and_save_data("cat")

        # Retrieving and logging information about the scanner's properties
        cm.get_info_properties()

        # Turning off the power of the CopyMachine
        cm.turn_off_power()

    finally:
        # Closing the log file
        if cm.file:
            cm.file.close()

# Ensuring that the main function is executed only if the script is run, not imported
if __name__ == "__main__":
    main()
