using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class FaqVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Id { get; set; }
        public string? Question { get; set; }
        public string? CategoryId { get; set; }
        public string? CategoryName { get; set; }
        public int? ViewCount { get; set; }
        public int? HelpfulCount { get; set; }
    }
}
