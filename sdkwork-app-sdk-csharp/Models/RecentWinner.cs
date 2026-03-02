using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class RecentWinner
    {
        public string? Nickname { get; set; }
        public string? PrizeName { get; set; }
        public string? WinTime { get; set; }
    }
}
