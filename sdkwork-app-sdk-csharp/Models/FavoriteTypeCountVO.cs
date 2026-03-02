using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FavoriteTypeCountVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Type { get; set; }
        public int? Count { get; set; }
        public string? TypeName { get; set; }
    }
}
