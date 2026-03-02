using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class StorageTypeDistributionVO
    {
        public double? Text { get; set; }
        public double? Image { get; set; }
        public double? Audio { get; set; }
        public double? Video { get; set; }
        public double? Other { get; set; }
    }
}
