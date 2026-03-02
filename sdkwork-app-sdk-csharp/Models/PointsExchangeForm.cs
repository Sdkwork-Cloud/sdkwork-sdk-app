using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PointsExchangeForm
    {
        public int? Quantity { get; set; }
        public string? AddressId { get; set; }
        public string? Remark { get; set; }
    }
}
