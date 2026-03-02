using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class RankingVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? RankingType { get; set; }
        public string? Period { get; set; }
        public List<RankInfoVO>? Rankings { get; set; }
        public RankInfoVO? MyRank { get; set; }
        public int? TotalUsers { get; set; }
    }
}
