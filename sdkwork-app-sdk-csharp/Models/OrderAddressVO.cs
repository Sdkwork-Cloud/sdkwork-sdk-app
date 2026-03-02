using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class OrderAddressVO
    {
        public string? Recipient { get; set; }
        public string? Phone { get; set; }
        public string? Address { get; set; }
    }
}
