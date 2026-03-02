using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CheckInMakeUpVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public bool? Success { get; set; }
        public string? Date { get; set; }
        public int? CostPoints { get; set; }
        public int? RemainingPoints { get; set; }
        public int? ConsecutiveDays { get; set; }
        public string? Message { get; set; }
    }
}
