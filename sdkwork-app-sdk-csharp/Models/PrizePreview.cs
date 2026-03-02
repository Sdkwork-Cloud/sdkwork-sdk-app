using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PrizePreview
    {
        public string? Name { get; set; }
        public string? Image { get; set; }
        public bool? IsGrandPrize { get; set; }
    }
}
