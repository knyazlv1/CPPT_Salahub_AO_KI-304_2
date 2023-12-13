import os
# Importing necessary classes
from Dimensions import Dimensions
from Properties import Properties
from Functionality import Functionality
# Class representing a Scanner
class Scaner:
    # Initializing instances of other classes
    def __init__(self):
        self.prop = Properties()
        self.dimension = Dimensions()
        self.func = Functionality()
        # Opening a log file for the scanner
        self.file = open("Scanner_log.txt", "w")

    def get_info_scaner_dimensions(self):
         # Writing scanner dimensions info to the log file
        self.file.write(f"Brand of scanner: {self.dimension.brand}\n"
                        f"Length of scanner: {self.dimension.length}\n"
                        f"Width of scanner: {self.dimension.width}\n"
                        f"Height of scanner: {self.dimension.height}\n"
                        f"Scanner has a handle: {self.dimension.is_handle}\n"
                        f"Scanner supports color scan: {self.dimension.is_color_scan}\n\n")
        self.file.flush()

    def get_info_properties(self):
         # Writing scanner properties info to the log file
        self.file.write(f"Scanner is duplex: {self.prop.is_duplex}\n"
                        f"Resolution DPI: {self.prop.resolution_dpi}\n"
                        f"Photogetter: {self.prop.photo_getter}\n"
                        f"Optical system: {self.prop.optical_system}\n"
                        f"Interface: {self.prop.interface}\n"
                        f"Source of light: {self.prop.source_of_light}\n\n")
        self.file.flush()

    def turn_on_power(self):
         # Turning on the scanner and logging the action
        self.func.power = True
        self.file.write("Scanner turned on\n\n")
        self.file.flush()

    def turn_off_power(self):
         # Turning off the scanner and logging the action
        self.func.power = False
        self.file.write("Scanner turned off\n\n")
        self.file.flush()

    def scan_photo_and_save_data(self, document_name):
        # Scanning a photo and saving data, logging the action
        if self.func.power:
            self.func.document = document_name
            self.func.success_save_info = True
            self.file.write(f"Document '{document_name}' scanned and data saved\n\n")
            self.file.flush()
        else:
            self.file.write("Please turn on the scanner\n\n")
            self.file.flush()

    def scan_doc_and_save_data(self, document_name):
        # Scanning a document and saving data, logging the action
        if self.func.power:
            self.func.document = document_name
            self.func.success_save_info = True
            self.file.write(f"Document '{document_name}' scanned and data saved\n\n")
            self.file.flush()
        else:
            self.file.write("Please turn on the scanner\n\n")
            self.file.flush()
