using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ShopStatisticsVO
    {
        public int? TotalShops { get; set; }
        public int? ActiveShops { get; set; }
        public int? InactiveShops { get; set; }
    }
}
