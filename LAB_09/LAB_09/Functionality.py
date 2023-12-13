# Class defining the basic functionality of the scanner
class Functionality:
    # Attributes defining the functionality
    def __init__(self):
        self.power = False
        self.barcode = "000000"
        self.qrcode = "non qr"
        self.document = ""
        self.photo = ""
        self.emptiness_buffer = True
        self.success_save_info = False


