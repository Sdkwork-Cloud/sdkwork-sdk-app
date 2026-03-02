using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class UserAddressUpdateForm
    {
        public string? Name { get; set; }
        public string? Phone { get; set; }
        public string? CountryCode { get; set; }
        public string? ProvinceCode { get; set; }
        public string? CityCode { get; set; }
        public string? DistrictCode { get; set; }
        public string? AddressDetail { get; set; }
        public string? PostalCode { get; set; }
        public bool? IsDefault { get; set; }
    }
}
