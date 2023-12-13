# Importing necessary classes
from Scaner import Scaner
from Copy import Copy

# Class representing a Copy Machine, inheriting from Scanner and Copy
class CopyMachine(Scaner, Copy):
    def __init__(self):
        # Initializing the parent classes (Scanner and Copy)
        super().__init__()

    def change_cartridge(self):
        # Checking if the copy machine is powered off
        if not self.func.power:
            # Logging cartridge change and flushing the file buffer
            self.file.write("Cartridge changed\n\n")
            self.file.flush()
        else:
            # Logging a message if the copy machine is not turned off
            self.file.write("Please turn off the copy machine\n\n")
            self.file.flush()