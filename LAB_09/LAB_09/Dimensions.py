# Class defining the physical dimensions of the scanner
class Dimensions:
    # Attributes defining the dimensions
    def __init__(self, length=50.0, width=25.0, height=10, brand="Canon", is_handle=False, is_color_scan=True):
        self.length = length
        self.width = width
        self.height = height
        self.brand = brand
        self.is_handle = is_handle
        self.is_color_scan = is_color_scan

