using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CheckInReward
    {
        public int? Points { get; set; }
        public string? ExtraReward { get; set; }
    }
}
