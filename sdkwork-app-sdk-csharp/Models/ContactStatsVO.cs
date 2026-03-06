using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ContactStatsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Total { get; set; }
        public int? Online { get; set; }
        public int? NewToday { get; set; }
    }
}
