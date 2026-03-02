using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ShopVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? LogoUrl { get; set; }
        public string? CoverUrl { get; set; }
        public string? ContactPhone { get; set; }
        public string? ContactEmail { get; set; }
        public string? Address { get; set; }
        public double? Latitude { get; set; }
        public double? Longitude { get; set; }
        public string? LicenseNumber { get; set; }
        public List<string>? Tags { get; set; }
        public string? BusinessHours { get; set; }
        public string? Status { get; set; }
        public string? StatusName { get; set; }
        public string? OwnerId { get; set; }
        public string? OwnerName { get; set; }
    }
}
