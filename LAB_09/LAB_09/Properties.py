# Class defining properties of the scanner
class Properties:
    # Attributes defining the properties
    def __init__(self, source_of_light="Xenon lamps", interface="RS232-C", optical_system="Class1",
                 photo_getter="CCD", resolution_dpi=600, is_duplex=True):
        self.source_of_light = source_of_light
        self.interface = interface
        self.optical_system = optical_system
        self.photo_getter = photo_getter
        self.resolution_dpi = resolution_dpi
        self.is_duplex = is_duplex

