private static Feature getImageFeature(BufferedImage orgImg)
    throws Exception {
    BufferedImage bi = new BufferedImage(
        orgImg.getWidth(),
        orgImg.getHeight(),
        BufferedImage.TYPE_INT_RGB
    );
    Graphics2D g = (Graphics2D)bi.getGraphics();
    g.drawImage(orgImg, 0, 0, null);
    ...